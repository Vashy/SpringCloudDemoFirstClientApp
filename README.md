# Application Boot
Run the following command to build the docker image:

    docker build -t first-client-app:latest .

And then run it:

    docker run -it --rm -p 8890:8890 --net=spring-cloud-app --name=first-client-app first-client-app:latest


