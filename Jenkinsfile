node {
stage('Clone') {
git ''
}
stage('Build') {
sh label: '', script: 'javac somme.java'
 sh label: '', script: 'javac multiplication.java'
}
stage('Run') {
sh label: '', 'script: 'java somme'
sh label: '', 'script: 'java multiplication'
}
}
