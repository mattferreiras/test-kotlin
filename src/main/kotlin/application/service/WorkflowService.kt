package application.service

import org.camunda.bpm.engine.RuntimeService
import org.springframework.stereotype.Service

@Service
class WorkflowService(private val runtimeService: RuntimeService) {

    fun startWorkflow(): String {
        return runtimeService.startProcessInstanceByKey("execute_something").processDefinitionId
    }

}