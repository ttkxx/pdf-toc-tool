# 指定PDF生成目录

在指定PDF文件中生成目录

- 使用绝对路径
- 原PDF文件中有目录，则使用方式为：

  ```shell
  /path/to/toc-tool.sh /path/to/pdf/with/toc offset /path/to/toc/description --delete
  ```
  例：

  ```shell
  /home/root/tool/toc-tool/toc-tool/toc-tool.sh /home/root/tool/toc-tool/toc-tool/example/InfoQ-copy/InfoQ-2020中国技术发展白皮书_toc.pdf 4 /home/root/tool/toc-tool/toc-tool/example/InfoQ-copy/toc-infoq.txt --delete
  ```
- 原PDF文件中没有目录，则使用方式为：

  ```shell
  /path/to/toc-tool.sh /path/to/pdf/without/toc offset /path/to/toc/description
  ```
  例：

  ```shell
  /home/root/tool/toc-tool/toc-tool/toc-tool.sh /home/root/tool/toc-tool/toc-tool/example/InfoQ-copy/InfoQ-2020中国技术发展白皮书.pdf 4 /home/root/tool/toc-tool/toc-tool/example/InfoQ-copy/toc-infoq.txt
  ```
