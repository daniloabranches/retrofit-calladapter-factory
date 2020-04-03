package com.exemplo.retrofitcalladapterfactory.calladapter

interface Mapper<T> {
    fun execute(data: T?): Any?
}