docker run -d \
  --name postgresql \
  -e POSTGRES_USER=oldaim \
  -e POSTGRES_PASSWORD=hello \
  -p 5432:5432 \
  postgres:latest
