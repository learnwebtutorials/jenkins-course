job('NodeJS example') {
    scm {
        git('https://github.com/learnwebtutorials/hello-app.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Allen')
            node / gitConfigEmail('info@blissfulwebdesign.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('Node JS') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
