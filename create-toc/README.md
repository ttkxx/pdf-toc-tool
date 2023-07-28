# 指定PDF生成目录

在指定**无目录**PDF文件中生成目录

基于 [pdf-toc-creator](https://github.com/kingcent/pdf-toc-creator)

## 用法

### 参数

- `-f` 文件路径
- `-o` offset 页码偏移量： 实际页码（从1开始编号） - 书籍页码
- `-t` toc PDF目录标签路径

### PDF目录标签

每行一条目录标签，每条标签描述一条目录

标签格式：

`层级 标题; 书籍页码`

- 通过tab缩进表示目录层级

## 示例

```
python pdf-toc-creator.py -f InfoQ-2020中国技术发展白皮书.pdf -o 4 -t toc-infoq.txt
```
