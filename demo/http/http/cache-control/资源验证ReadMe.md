一、Cache-Control 是在客户端的缓存；
当内容变化时，需要更新css，js文件相关缓存时，就是文件后面缀上哈希码
js/css 文件hash码是根据内容来的hash码: 内容相同，哈希码不变，内容不同，哈希码不同

二、验证头
last-modified
和 Etag

1. Last-Modified
上次修改时间
配合If-Modified-Since或If-UnModified-Since使用
对比上次修改时间，判断资源是否有更新

2.Etag
数据签名，资源被修改，签名被修改，常见的是哈希算法
配合If-Match, If-Non-Match 使用

根据签名判断签名

三、no-cache和no-store区别
no-cache从服务器获取验证，能够使用缓存，就使用
no-store每次强制从服务器获取