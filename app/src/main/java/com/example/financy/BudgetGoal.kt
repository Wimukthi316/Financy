package com.example.financy

import java.util.*

data class BudgetGoal(
    val id: String = UUID.randomUUID().toString(),
    val monthYear: String, // Format: MM/yyyy
    val amount: Double
)