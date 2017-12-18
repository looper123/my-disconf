#可以通过启动脚本指定连接到哪一个环境上（支持disconf.properties上所有配置） local/rd/qa/online (可以在不修改代码的情况下变更部署服务器)
java  -Ddisconf.env=rd \
    -Ddisconf.enable.remote.conf=true \
    -Ddisconf.conf_server_host=127.0.0.1:8000 \
    -Dlogback.configurationFile=logback.xml \
    -Dlog4j.configuration=file:log4j.properties \
    -Djava.ext.dirs=lib \
    -Xms1g -Xmx2g -cp ampq-logback-client-0.0.1-SNAPSHOT.jar \
    com.github.knightliao.consumer.ConsumerMain >/dev/null 2>&1 &