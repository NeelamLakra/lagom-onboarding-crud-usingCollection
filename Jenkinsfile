pipeline
{
    agent any
    dir("MyProject"){
         stages {
                  stage('compile stage'){
                    steps {
                        sh 'mvn clean compile'
                          } }
                stage('test stage'){
                  steps {
                    sh 'mvn test'
                  }  }
             }
}
}
