所有二级域名共享cookie,
设置cookie的属性domain, 例如
'Set-Cookie': ['id=123;max-age=2', 'abc=456;domain=test.com']
表示所有test.com下的域名都能共享该域名的cookie


Session只要能定位到唯一用户都是session，由于id唯一，所以其中一个方法是就是将session的id作为键值对存储在cookie里。
Session !=Cookie