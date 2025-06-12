// def call(){
//   dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
//   dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
// }

def call(){
  dependencyCheck additionalArguments: '--scan ./ --disableCveKev', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
