package com.waykichain.wallet.transaction

import com.waykichain.wallet.WaykiTransactions
import com.waykichain.wallet.transaction.encode.params.WaykiTestNetParams
import org.junit.Test
import org.slf4j.LoggerFactory

class TransactionDecode {
    private val logger = LoggerFactory.getLogger(javaClass)

    @Test
    fun testParseTransactionRaw() {
        val waykiTransactions=WaykiTransactions()
        val netParams = WaykiTestNetParams.instance
        var rawtx = "0b0180cb4c21036c5397f3227a1e209952829d249b7ad0f615e43b763ac15e3a6f52627a10df21045749434383e1ac000114079b9296a00a2b655787fa90e66ec3cde4bf1c8c0457494343cd1006e8bdace8b4a647304502210097cfa3068593913894fceeddc724e0848fb7c2012d406e3d3f21eab9211d208702203bd0835017bccd054a3770d6c838925760cc3de70ac646919705192f7c160751"
        var ret = waykiTransactions.decodeTxRaw(rawtx, netParams)
        logger.info(ret.toString())

        rawtx = "0201999c7d2102a722a3a94fb41d92bcf9d54cd76ea40c8b0c223d6f0570389b775120c5e487640083e1ac0046304402205304902f6ae8470e7c294b8abe7fdd5a9847d8980914234c9ddb9b6098e473d002200ad2d0238292285394447905cb20b7275cd2daf3a68d1237a1200982b99172bc"
        ret =  waykiTransactions.decodeTxRaw(rawtx, netParams)
        logger.info(ret.toString())

        rawtx = "0f01abb416020001049abf7f0102f001858c2004574943430457555344aed6c100473045022100c9bc3579329d6a63a96fce8271ff7c09700f82fbbefcba37f59cd6ddb2bf79b70220476864326646346e5d2a34f2b0e326f2a1ec4f4114ca3513d69d8fdea6d7471c"
        ret =  waykiTransactions.decodeTxRaw(rawtx, netParams)
        logger.info(ret.toString())
    }

}