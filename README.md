"# Instabug_task" 



**** To run the third part (pro folder), setup Java, add it to environment variables, setup IntelliJ, and add these dependencies code to pom.xml
 <dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.9.1</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version> <!-- Use the appropriate version -->
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.8.0</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    **** To run the fourth part(instabug.postman_collection), setup Postman and then import the provided collection and also setup node js(prefered to be lts version).

