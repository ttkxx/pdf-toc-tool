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

public class App {

    public static final String DEST = "/home/root/tool/pdf-toc-creator-master/ONJAVAoutlinechanged.pdf";
    public static final String INPUT = "/home/root/tool/pdf-toc-creator-master/ONJAVA.pdf";

    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new App().removeWholeOutlineSubtree(DEST);
//        new removeOutlines().removeAllOutlines(DEST);
    }

    public void removeWholeOutlineSubtree(String DEST) throws IOException {
        
        PdfReader reader = new PdfReader(INPUT);
        PdfWriter writer = new PdfWriter(DEST);
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        pdfDocument.getOutlines(true).removeOutline();
        pdfDocument.close();

    }
}
