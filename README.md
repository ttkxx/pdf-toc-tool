- 删除PDF中已存在的目录

  - /home/root/tool/pdf-toc/delete-toc/src/main/java/my/tool/pdf/App.java

    - 结果文件DEST = "/home/root/tool/pdf-toc-creator-master/ONJAVAoutlinechanged.pdf";
    - 处理INPUT = "/home/root/tool/pdf-toc-creator-master/ONJAVA.pdf";

    ---


    - [Removing Items from a PDF&#39;s Outline Tree](https://kb.itextpdf.com/home/it7kb/examples/removing-items-from-a-pdf-s-outline-tree)
- 创建目录

  - /home/root/tool/pdf-toc/pdf-toc-creator-master/pdf-toc-creator.py
    - python pdf-toc-creator.py -f InfoQ-2020中国技术发展白皮书.pdf -o 3 -t toc-infoq.txt
      - -f 路径
      - -o 页码偏移量=实际页码-书籍标码
      - -t 目录描述文件

  ---


  - [pdf-toc-creator](https://github.com/kingcent/pdf-toc-creator)
