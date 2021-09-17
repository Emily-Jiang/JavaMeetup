FROM open-liberty:full-java11-openj9


COPY --chown=1001:0 src/main/liberty/config/ /config/
COPY --chown=1001:0 target/liberty/wlp/usr/servers/talk/bootstrap.properties /config/
COPY --chown=1001:0 target/liberty/wlp/usr/servers/talk/server.env /config/
COPY --chown=1001:0 target/*.war /config/apps/

RUN configure.sh