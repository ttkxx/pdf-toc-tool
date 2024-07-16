# 指定PDF生成目录

根据指定PDF目录标签、页码偏移量（实际页码（从1开始编号） - 书籍页码）在指定PDF文件中生成目录

- 使用绝对路径
- 原PDF文件中有目录，则使用方式为：

  ```shell
  /path/to/toc-tool.sh /path/to/pdf/with/toc offset /path/to/toc/description --delete
  ```

  例：

  ```shell
  /home/root/tool/toc-tool/toc-tool/toc-tool.sh /home/root/tool/toc-tool/toc-tool/example/InfoQ/InfoQ-2020中国技术发展白皮书_toc.pdf 4 /home/root/tool/toc-tool/toc-tool/example/InfoQ/toc-infoq.txt --delete
  ```
- 原PDF文件中没有目录，则使用方式为：

  ```shell
  /path/to/toc-tool.sh /path/to/pdf/without/toc offset /path/to/toc/description
  ```

  例：

  ```shell
  /home/root/tool/toc-tool/toc-tool/toc-tool.sh /home/root/tool/toc-tool/toc-tool/example/InfoQ/InfoQ-2020中国技术发展白皮书.pdf 4 /home/root/tool/toc-tool/toc-tool/example/InfoQ/toc-infoq.txt
  ```

## PDF目录标签

描述目录的文件

每行一条目录标签，描述一条目录

标签格式：

`层级 标题; 书籍页码`

- 通过tab缩进表示目录层级

例：

```plaintext
第一部分 综述篇;02
	一、世界深度变革，科技主导未来;03
		1.1 我们正处在技术爆炸的时代;04
		1.2 我国正处在转变发展形式、调整经济结构的关键时期; 06
		1.3 新冠疫情之下，我国着力推进新基建相关部署;07
	二、技术概述;08
		2.1 技术的定义及本质; 08
		2.2 技术的进化; 09 
		2.3 技术的作用; 09 
		2.4 技术与经济的关系; 09 
		2.5 技术创新与国家竞争力; 11 
		2.6 传统工业与信息的关系; 12 
		2.7 整体技术发展趋势; 13
```

## 注意事项

