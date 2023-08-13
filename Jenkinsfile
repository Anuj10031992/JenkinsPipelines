pipeline
{
agent any
stages
{
		/*stage('cleaning stage'){
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
        }*/
		stage("Parallel Execution") {
			steps {
				parallel(
				      a: {
					bat "mvn clean"
				      },
				      b: {
					bat "mvn test"
				      },
				      c: {
					bat "mvn package"
				      }
				)
			}
		}
       stage('Consolidated Results') {
			steps {
			input("do you want to capture results")
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                } 
				}
		stage("Email Build Status"){
			steps {
				mail body: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult} \n\nCheck console output at ${env.BUILD_URL} to view the results.", subject: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult}!!", to: 'anuj.varshney.kumar05@gmail.com'
			}
		}
				
}	
}			
				
				
				
