pipeline
{
agent any
stages
{
		stage('cleaning stage'){
           steps {
				bat "mvn clean"
				}
        }
		stage('testing stage'){
			steps {
            bat "mvn test"
			}
        }
        stage('packaging stage'){
			steps {
            bat "mvn package"
			}
        }
       stage('Consolidated Results') {
			steps {
			input("do you want to capture results")
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                } 
				}
				
}	
}			
				
				
				
