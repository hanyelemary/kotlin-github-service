package github
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

@RunWith(JUnitPlatform::class)
object GitHubControllerTests : Spek({
    describe("GitHubController methods") {
        given("A GitHub username") {
            val githubService = mock(GitHubService::class.java)
            val githubController = GitHubController(gitHubService = githubService)
            val username = "hanyelemary"

            on("get repos by username") {
                githubController.reposByUser(username)

                it("should invoke service get repos by username") {
                    verify(githubService).reposByUser(username)
                }
            }
        }
    }
})