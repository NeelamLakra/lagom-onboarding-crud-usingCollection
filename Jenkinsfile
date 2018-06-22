pipeline
{
    agent any
         stages {
             dir("MyProject")
              {
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
