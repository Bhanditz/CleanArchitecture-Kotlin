package com.github.juan1393.cleanArchitectureKotlin.domain.useCase.signOut

import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.base.BaseUseCase
import com.github.juan1393.cleanArchitectureKotlin.app.ui.base.mainThread.MainThread
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.executor.UseCaseExecutor
import com.github.juan1393.cleanArchitectureKotlin.data.repository.UserRepository


class SignOutUseCase(private val userRepository: UserRepository,
                     executor: UseCaseExecutor, mainThread: MainThread) :
        BaseUseCase<SignOutRequest, SignOutResponse>(executor, mainThread) {

    override fun run() {
        userRepository.signOut()
    }
}