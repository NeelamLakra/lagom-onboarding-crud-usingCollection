pipeline
{
    agent any
         stages {
                  stage('compile stage')
                    {
                    steps {    
                        sh 'pushd MyProject'   
                        sh 'mvn clean compile'
                             
                          }
                     }
                stage('test stage')
                        {
                        steps {
                            sh 'popd MyProject'
                                sh 'mvn test'
                              }
                        }
                }
}
