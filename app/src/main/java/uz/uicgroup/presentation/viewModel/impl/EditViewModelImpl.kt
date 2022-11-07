package uz.uicgroup.presentation.viewModel.impl

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.uicgroup.domain.use_case.TransUseCase
import uz.uicgroup.presentation.viewModel.EditViewModel
import javax.inject.Inject

@HiltViewModel
class EditViewModelImpl @Inject constructor(
    private val transUseCase: TransUseCase
) : ViewModel(), EditViewModel {

}