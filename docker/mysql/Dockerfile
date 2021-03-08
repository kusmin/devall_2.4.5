FROM mysql:8
ENV MYSQL_USER=devall
ENV MYSQL_PASSWORD=devall
ENV MYSQL_DATABASE=devall
ENV MYSQL_ROOT_PASSWORD=root
COPY ./scripts/* /docker-entrypoint-initdb.d/

