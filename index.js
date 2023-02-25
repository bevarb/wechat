const express = require('express')
const app =express()

app.get('/', (req, res) => {
    res.send('HELLO XIAO YANG')
})

const port =process.env.PORT || 80
app.listen(port, () => {
    concole.log('服务启动成功，端口:', port)
})
