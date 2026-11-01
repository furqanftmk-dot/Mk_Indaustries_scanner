class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var camera: Camera? = null
    private var cameraProvider: ProcessCameraProvider? = null
    private var imageAnalysis: ImageAnalysis? = null
    private var barcodeScanner: BarcodeScanner? = null
    private var isTorchOn = false
    private var isScanning = true
    private var lastBackPressTime = 0L
    private var activeCategory = "url"
    private var activeScannedText = ""
    private var currentRating = 0
    private var generationCount = 0
    private var isQrGenerated = false
    
    // Settings
    private var autoUrl = true
    private var soundEnabled = true
    private var vibrateEnabled = true
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
        checkCameraPermission()
        loadSettings()
        buildForm("url")
        setupAdMob()
    }
    ...
}
