pipeline
{
    agent any
         stages {
                  stage('compile stage')
                    {
                    steps {    
                        dir("MyProject")
                             {
                        sh 'mvn clean compile'
                             }
                          }
                     }
                stage('test stage')
                        {
                        steps {
                            dir("MyProject")
                               {
                                sh 'mvn test'
                                } 
                              }
                        }
                }
}
