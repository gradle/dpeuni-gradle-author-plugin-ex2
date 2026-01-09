package com.gradlelab

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property

interface RecordstrExtension {

    val str : Property<String>

    val helloFile : RegularFileProperty
}