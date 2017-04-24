# Mary TTS with SpringBoot
This project is an implementation of [MaryTTS](https://github.com/marytts/marytts) project with [Spring-Boot](https://projects.spring.io/spring-boot/) Framework.

<br>

## Prerequisite

You should have basic knowledge of Java, SpringBoot, [Maven](https://maven.apache.org/index.html)


## Compilation

Clone the repo and run the below command from the root of the project

    mvn clean package

This will consume some time and bandwidth if you are runnning it first time.

In the mean time, you can import this project in [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux) as it is made on it to see the structure.

After successfull deployment, you will get <code>ROOT.war</code> file in <code>deployments</code> directory

## Execute

  You project is ready to ship. Deploy it on [Jetty](http://www.eclipse.org/jetty/download.html) or see the power of SpringBoot using below command

    java -jar deployments/ROOT.war

  Go to this address:

    http://localhost:8080/audio?text=this%20program%20is%20working%20fine
    
Your browser will download <code>audio.wav</code> file. Run it using any Media Player.

Any ideas to improve the project are welcomed.
