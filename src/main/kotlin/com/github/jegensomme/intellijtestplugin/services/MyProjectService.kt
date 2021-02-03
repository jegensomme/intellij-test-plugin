package com.github.jegensomme.intellijtestplugin.services

import com.github.jegensomme.intellijtestplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
