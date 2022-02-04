package com.github.juandelacruzcalvo.codesearch.services

import com.intellij.openapi.project.Project
import com.github.juandelacruzcalvo.codesearch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
