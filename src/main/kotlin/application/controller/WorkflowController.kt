package application.controller

import application.service.WorkflowService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/workflow")
class WorkflowController(private val workflowService: WorkflowService) {

    @PostMapping("/start")
    @ResponseStatus(HttpStatus.OK)
    fun startWorkflow(): String {
        return workflowService.startWorkflow()
    }
}