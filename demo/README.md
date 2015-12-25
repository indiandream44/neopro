ssh -i neu-II.pem ec2-user@ec2-54-229-200-148.eu-west-1.compute.amazonaws.com

git clone https://github.com/indiandream44/neopro.git

./gradlew tomcatRun



wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u65-b17/jdk-8u65-linux-x64.tar.gz"

sudo update-alternatives --install /usr/bin/java java /opt/java/jdk1.8.0_65/bin/java 100

sudo update-alternatives --install /usr/bin/javac javac /opt/java/jdk1.8.0_65/bin/javac 100
sudo update-alternatives --config javac

sudo update-alternatives --install /usr/bin/jar jar /opt/java/jdk1.8.0_65/bin/jar 100
sudo update-alternatives --config jar


export JAVA_HOME=/opt/java/jdk1.8.0_65/
export JRE_HOME=/opt/java/jdk1.8.0._65/jre
export PATH=$PATH:/opt/java/jdk1.8.0_65/bin:/opt/java/jdk1.8.0_65/jre/bin

http://54.229.200.148/DemoApplication/

http://ec2-54-229-200-148.eu-west-1.compute.amazonaws.com/

/home/ec2-user/myapp/neopro/demo/application.properties

nohup sudo java -jar -Dserver.port=80 -Dapp.config=/home/ec2-user/myapp/neopro/demo/application.properties build/libs/sayona-0.0.1-SNAPSHOT.jar &



--- PLANS -----
- Integrate DB base security
- PASSWORD ENCRYPTION
- NEED AN IDEA WHAT WE CAN INTEGRATE
- Events photograph
- B'day Anniversary, and tithis...
- Familiy Hierarchie
- Each user's own space

