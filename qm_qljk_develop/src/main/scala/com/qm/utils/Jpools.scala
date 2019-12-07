package com.qm.utils

import redis.clients.jedis.{Jedis, JedisPool}

object Jpools {

    private val jedisPool = new JedisPool(AppParams.redisHost)


    def getJedis: Jedis = {
        val jedis = jedisPool.getResource
        jedis.select(AppParams.selectDBIndex)
        jedis
    }
}
