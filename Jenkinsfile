pipeline
{
agen any
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
       
				
}	
}			
				
				
				