package com.github.meixuesong.idearefactoringmetrics.services

import com.intellij.openapi.project.Project
import com.github.meixuesong.idearefactoringmetrics.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
