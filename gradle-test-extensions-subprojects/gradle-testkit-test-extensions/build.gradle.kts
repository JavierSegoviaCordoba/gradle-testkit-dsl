hubdle {
    config {
        analysis()
        coverage()
        documentation {
            api()
        }
        explicitApi()
        publishing()
    }

    kotlin {
        jvm {
            main {
                dependencies {
                    api(gradleKotlinDsl())
                    api(gradleTestKit())
                    api(hubdle.javiersc.kotlin.kotlinStdlib)
                    api(hubdle.junit.jupiter.junitJupiterApi)
                    api(hubdle.junit.jupiter.junitJupiterParams)
                    api(projects.gradleTestExtensionsSubprojects.gradleCommonTestExtensions)
                }
            }
        }
    }
}
