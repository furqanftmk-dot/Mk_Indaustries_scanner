@Database(entities = [ScanHistory::class, Setting::class], version = 1, exportSchema = false)
abstract class MKDatabase : RoomDatabase() {
    abstract fun scanHistoryDao(): ScanHistoryDao
    abstract fun settingsDao(): SettingsDao
}
