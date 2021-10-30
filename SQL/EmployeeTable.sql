CREATE TABLE [dbo].[employee](
	[employee_id] [bigint] NOT NULL,
	[advance_statuatory_bonus] [bigint] NULL,
	[address] [varchar](255) NULL,
	[basic] [bigint] NULL,
	[conveyance_allowance] [bigint] NULL,
	[house_rental_allowance] [bigint] NULL,
	[medical_allowance] [bigint] NULL,
	[name] [varchar](255) NULL,
	[special_allowance] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[employee_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

