package github

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GitHubController(val gitHubService: GitHubService) {

    @GetMapping("/users/{username}")
    fun userProfile(@PathVariable(name = "username") username: String): ResponseEntity<String>? {
        return gitHubService.userProfile(username)
    }

    @GetMapping("/users/{username}/repos")
    fun reposByUser(@PathVariable(name = "username") username: String): ResponseEntity<String>? {
        return gitHubService.reposByUser(username)
    }
}