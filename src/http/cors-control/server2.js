const http = require('http');

http.createServer(function (request, response) {
    console.log('request come', request.url);

    response.writeHead(200, {
        'Access-Control-Allow-Origin': 'http://localhost:8888',
        'Access-Control-Allow-Headers': 'X-Test-Cors',
        'Access-Control-Allow-Methods': 'GET, PUT',
        //多长时间内，无需再次发送预请求验证
        'Access-Control-MAX-AGE': '1000'
    });
    response.end('123');
}).listen(8887);

console.log('server listening on 8887');