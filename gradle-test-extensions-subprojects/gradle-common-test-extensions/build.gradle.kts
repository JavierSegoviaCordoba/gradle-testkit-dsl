plugins {
    alias(libs.plugins.javiersc.hubdle)
}

hubdle {
    config {
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
                    api(javierscKotlinStdlib())
                    api(junitJupiterApi())
                    api(junitJupiterParams())
                }
            }
        }
    }
}
