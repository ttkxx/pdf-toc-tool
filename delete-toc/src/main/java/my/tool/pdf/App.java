package my.tool.pdf;

/**
 * Hello world!
 *
 */
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class App {

    // public static final String DEST = "/home/root/tool/toc-modify/toc-modify/example/InfoQ-copy/InfoQ-2020中国技术发展白皮书_toc_toc_deleted.pdf";
    // public static final String INPUT = "/home/root/tool/toc-modify/toc-modify/example/InfoQ-copy/InfoQ-2020中国技术发展白皮书_toc.pdf";

    // private static String getProcessedFilePath(String filePath){
    //     return String.format("%s_toc-deleted.pdf", filePath.substring(0,filePath.lastIndexOf(".pdf")));
    // }




    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(Arrays.toString(args));
        if(args.length!=2) throw new IllegalArgumentException(Arrays.toString(args));
        String filePath=args[0];
        String processedFilePath=args[1];
        // TODO Set path of file processed.
        // String processedFilePath=getProcessedFilePath(filePath);
        System.out.printf("filePath: %s\n",filePath);
        System.out.printf("processedFilePath: %s\n",processedFilePath);


        // TODO process
        File file = new File(processedFilePath);
        file.getParentFile().mkdirs();
        new App().removeWholeOutlineSubtree(filePath,processedFilePath);
    }

    public void removeWholeOutlineSubtree(String filePath,String processedFilePath) throws IOException {
        
        PdfReader reader = new PdfReader(filePath);
        PdfWriter writer = new PdfWriter(processedFilePath);
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        pdfDocument.getOutlines(true).removeOutline();
        pdfDocument.close();

    }
}
