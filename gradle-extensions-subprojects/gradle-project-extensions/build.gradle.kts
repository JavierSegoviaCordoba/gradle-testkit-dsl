plugins {
    alias(libs.plugins.javiersc.hubdle)
}

hubdle {
    config {
        analysis()
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

                    implementation(libs.javiersc.semver.core)
                }
            }
        }
    }
}
