plugins {
	`kotlin-dsl`
}

repositories {
	jcenter()
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.31")
}

kotlinDslPluginOptions {
	experimentalWarning.set(false)
}
