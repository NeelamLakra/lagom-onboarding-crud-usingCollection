pipeline {
agent any
stages {
stage('compile stage') {
  steps {
    dir("MyProject"){
      path './MyProject'
sh 'mvn clean compile'
}
}
}
}
}
