pipeline {
agent any
stages {
stage('compile stage') {
  steps {
    dir {
      path './MyProject'
sh 'mvn clean compile'
}
}
}
}
}
