select spec_no,
    display_type,
    display_size,
    camera_quality,
    os
from mobile_specification whereinternal_mem_in_mb > 200
    and memory_card_capacity_GB = 32;