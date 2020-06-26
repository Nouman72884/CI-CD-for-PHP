pipelineJob("php") {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/Nouman72884/CI-CD-for-PHP.git")
            credentials("github-credentials")
          }
          branch('master')
        }
      }
      scriptPath("jenkinsfile")
    }
  }
}
