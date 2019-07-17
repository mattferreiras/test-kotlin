package application.camunda.task

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class DoSomethingTask : JavaDelegate {

    override fun execute(delegateExecution: DelegateExecution) {

        delegateExecution.setVariable("TEST", 1)

    }
}