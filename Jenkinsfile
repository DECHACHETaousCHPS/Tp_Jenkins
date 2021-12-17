pipeline {
         agent any
         stages {
                 stage('Clone') {
                 steps {
                     echo 'Obtenir une copie des deux applications'
                     sh "rm -rf *"
                     sh "git clone https://github.com/DECHACHETaousCHPS/Tp_Jenkins.git"
                     
       		}       
                 }
                 stage('Build') {
                 steps {
                    echo 'Builder les deux applications '
                    sh "cd Tp_Jenkins / && javac somme.java"
                    sh "cd Tp_Jenkins / && javac multiplication.java"
                    
                 }
                 }
                 stage('Run') {
                 steps {
                    echo 'Executer les deux applications '
                    sh "cd Tp_Jenkins / && java somme"
                    sh "cd Tp_Jenkins / && java multiplication"
                    
                 }
                 }
                 
}
}
