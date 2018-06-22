pipeline {
agent any
stages {
stage('compile stage') {
  steps {
   sh 'cd MyProject'
    withMaven(maven: 'maven_3_5_0') {
sh 'mvn clean compile'
}
}
}
}
}
